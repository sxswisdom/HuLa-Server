package com.hula.ai.llm.openai.entity.whisper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * 描述：语音转文字
 */
@Data
public class Whisper implements Serializable {


    @Getter
    @AllArgsConstructor
    public enum Model {
        WHISPER_1("whisper-1"),
        ;
        private final String name;
    }

    @Getter
    @AllArgsConstructor
    public enum ResponseFormat {
        JSON("json"),
        TEXT("text"),
        SRT("srt"),
        VERBOSE_JSON("verbose_json"),
        VTT("vtt"),
        ;
        private final String name;
    }
}
