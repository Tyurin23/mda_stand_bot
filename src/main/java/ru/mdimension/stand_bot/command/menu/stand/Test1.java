package ru.mdimension.stand_bot.command.menu.stand;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import ru.mdimension.stand_bot.command.Command;
import ru.mdimension.stand_bot.dto.ShotUpdateDto;

import static ru.mdimension.stand_bot.ExampleBotApplication.test1;
import static ru.mdimension.stand_bot.Util.getSendMessage;
import static ru.mdimension.stand_bot.constant.BotConstant.TEST1_COMMAND_START;
import static ru.mdimension.stand_bot.constant.BotConstant.TEST1_COMMAND_STOP;

public class Test1 implements Command {
    private ShotUpdateDto updateDto;

    @Override
    public SendMessage apply(long chatId) {
        return getSendMessage(chatId, updateDto, test1, TEST1_COMMAND_START, TEST1_COMMAND_STOP);
    }

    public Test1(ShotUpdateDto dto) {
        this.updateDto = dto;
    }
}

