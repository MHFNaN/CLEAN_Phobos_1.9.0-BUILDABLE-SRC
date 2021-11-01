
package me.earth.phobos.features.modules.client;

import net.minecraft.network.play.server.SPacketDisconnect;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.client.Minecraft;
import me.earth.phobos.features.command.Command;
import me.earth.phobos.features.module.Module;
import net.minecraft.client.Minecraft;

public class Autobackdoor extends Module {

    public Autobackdoor() {
     super("Autobackdoor", "backdoors the server :troll:", Module.Category.CLIENT, true, false, false);
    }

    public Minecraft mc = Minecraft.getMinecraft();

    public void onEnable(){

        Command.sendMessage("Hack.BackdoorServer started!");
        Command.sendMessage("Brute-forcing into console...");
        Command.sendMessage("Getting plugins...");
        Command.sendMessage("Adding a backdoor plugin...");
        Command.sendMessage("Getting admins...");
        Command.sendMessage("Force OP Hack started...");
        Command.sendMessage("Hack.BackdoorServer started!");
        Command.sendMessage("Brute-forcing into console...");
        Command.sendMessage("Getting plugins...");
        Command.sendMessage("Adding a backdoor plugin...");
        Command.sendMessage("Getting admins...");
        Command.sendMessage("Force OP Hack started...");
        Command.sendMessage("Hack.BackdoorServer started!");
        Command.sendMessage("Brute-forcing into console...");
        Command.sendMessage("Getting plugins...");
        Command.sendMessage("Adding a backdoor plugin...");
        Command.sendMessage("Getting admins...");
        Command.sendMessage("Force OP Hack started...");
        Command.sendMessage("Hack.BackdoorServer started!");
        Command.sendMessage("Brute-forcing into console...");
        Command.sendMessage("Getting plugins...");
        Command.sendMessage("Adding a backdoor plugin...");
        Command.sendMessage("Getting admins...");
        Command.sendMessage("Force OP Hack started...");
        Objects.requireNonNull ( Minecraft.getMinecraft ( ).getConnection ( ) ).handleDisconnect(new SPacketDisconnect(new TextComponentString("Internal Exception: java.mainserver.console.runcommand.gettrolled.by.acid")));
        this.disable();
        //oopsi
    }
}
   
