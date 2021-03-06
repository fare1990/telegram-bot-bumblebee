package com.github.bumblebee.command.status

import com.github.bumblebee.command.SingleArgumentCommand
import com.github.telegram.api.BotApi
import com.github.telegram.domain.Update
import org.springframework.stereotype.Component

@Component
class StatusCommand(val botApi: BotApi) : SingleArgumentCommand() {

    override fun handleCommand(update: Update, chatId: Long, argument: String?) {
        botApi.sendMessage(chatId, "I'm fine!")
    }
}