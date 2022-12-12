package viterbo.atividade.api.dto;

import jakarta.validation.constraints.NotBlank;
import viterbo.atividade.api.entity.Event;

public record EventDTO (
        @NotBlank
        String nome,
        @NotBlank
        String sigla,
        @NotBlank
        String descricao
) {

    public EventDTO(Event event){
        this(event.getNome(), event.getSigla(), event.getDescricao());
    }
}