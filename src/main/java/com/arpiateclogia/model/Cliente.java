package com.arpiateclogia.model;

import com.arpiateclogia.enums.StatusE;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Cliente {

    private Long id;

    private String razaoSocial;

    private String fantasia;

    private StatusE statusE;

    public boolean isAprovado() {
        return StatusE.APROVADO.equals(this.statusE);
    }
}
