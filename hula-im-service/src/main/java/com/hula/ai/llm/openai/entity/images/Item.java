package com.hula.ai.llm.openai.entity.images;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述：
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item implements Serializable {
    private String url;
    @JsonProperty("b64_json")
    private String b64Json;
    @JsonProperty("revised_prompt")
    private String revisedPrompt;
}
