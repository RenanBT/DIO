package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "O numero Id precisa ser positivo.")
  private Long alunoId;

  @NotBlank(message = "Campo não pode ser deixado em branco.")
  @Positive(message = "${validatedValue}'O peso precisa ser positivo.")
  private double peso;

  @NotBlank(message = "Preencha o campo corretamente.")
  @Positive(message = "${validatedValue}'A altura precisa ser positiva.")
  @DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")
  private double altura;
}
