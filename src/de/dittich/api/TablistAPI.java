package de.dittich.api;

//Siehe CookieTV Folge 3

import java.lang.reflect.Field;

import net.minecraft.server.v1_12_R1.IChatBaseComponent;
import net.minecraft.server.v1_12_R1.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_12_R1.PacketPlayOutPlayerListHeaderFooter;
import net.minecraft.server.v1_12_R1.PlayerConnection;

import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class TablistAPI {

	public static void sendTabTitle(Player player, String head, String foot) {
		if (head == null)
			head = "";
		if (foot == null)
			foot = "";

		PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;

		IChatBaseComponent header = ChatSerializer.a("{\"text\": \"" + head
				+ "\"}");

		IChatBaseComponent footer = ChatSerializer.a("{\"text\": \"" + foot
				+ "\"}");

		PacketPlayOutPlayerListHeaderFooter packet = new PacketPlayOutPlayerListHeaderFooter();

		try {

			Field headerField = packet.getClass().getDeclaredField("a");
			headerField.setAccessible(true);
			headerField.set(packet, header);
			headerField.setAccessible(!headerField.isAccessible());
			Field footerField = packet.getClass().getDeclaredField("b");
			footerField.setAccessible(true);
			footerField.set(packet, footer);
			footerField.setAccessible(!footerField.isAccessible());
		} catch (Exception e) {
			e.printStackTrace();
		}

		connection.sendPacket(packet);
	}
}
