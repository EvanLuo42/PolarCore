package cc.sfclub.polar.commands;

import cc.sfclub.polar.CommandBase;
import cc.sfclub.polar.events.messages.TextMessage;
import cc.sfclub.polar.user.User;

public class Unknown extends CommandBase {
    /* NOTICE
    THIS COMMAND CANNOT USE ANNOTATION FOR REGISTRATION
    Because Unknown is a not COMMON Command.
    See head of CommandManager.java for more info.
     */
    @Override
    public String getDescription() {
        return "fallback";
    }

    @Override
    public String getPerm() {
        return "member.basic.unknown";
    }

    @Override
    public void onCommand(User u, TextMessage Command) {
        Command.reply("WTF are you speaking?");
    }
}
