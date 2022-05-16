module com.network.chat.command {
    opens com.network.chat.command to com.network.chat.client;
    opens com.network.chat.command.commands to com.network.chat.client;
    exports com.network.chat.command;
    exports com.network.chat.command.commands;
}