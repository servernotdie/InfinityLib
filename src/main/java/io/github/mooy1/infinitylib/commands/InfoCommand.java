package io.github.mooy1.infinitylib.commands;

import java.util.List;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.command.CommandSender;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.common.ChatColors;

@ParametersAreNonnullByDefault
final class InfoCommand extends SubCommand {

    private final String[] message;

    InfoCommand(SlimefunAddon addon) {
        super("info", "Hiển thị thông tin phiên bản của addon và Slimefun, cùng với Discord");
        Slimefun slimefun = Slimefun.instance();
        message = new String[] {
                "",
                ChatColors.color("&b" + addon.getName() + " Thông tin"),
                ChatColors.color("&bSlimefun Phiên bản: &7" + (slimefun == null ? "null" : slimefun.getPluginVersion())),
                ChatColors.color("&bSlimefun Discord: &7Discord.gg/slimefun"),
                ChatColors.color("&bAddon Phiên bản: &7" + addon.getPluginVersion()),
                ChatColors.color("&bCộng đồng Discord: &7Discord.gg/SqD3gg5SAU"),
                ChatColors.color("&bGithub: &7" + addon.getBugTrackerURL()),
                ""
        };
    }

    @Override
    protected void execute(CommandSender sender, String[] args) {
        sender.sendMessage(message);
    }

    @Override
    protected void complete(CommandSender sender, String[] args, List<String> tabs) {

    }

}
