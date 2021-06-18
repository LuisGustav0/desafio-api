package com.arpiateclogia.model;

import com.arpiateclogia.enums.StatusE;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Cliente {

    private Long id;

    private String razaoSocial;

    private String fantasia;

    private StatusE statusE;

    public boolean isAprovado() {
        return StatusE.APROVADO.equals(this.statusE);
    }

    public boolean isCancelado() {
        return StatusE.CANCELADO.equals(this.statusE);
    }

    public boolean isNaoAprovado() {
        return !isAprovado() || !isCancelado();
    }
}
