package com.prankersize.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prankersize.swagger.model.DiePool;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Trait
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-09T14:57:59.332-05:00")

public class Trait   {
  @JsonProperty("wording")
  private String wording = null;

  @JsonProperty("dice")
  private List<DiePool> dice = new ArrayList<DiePool>();

  public Trait wording(String wording) {
    this.wording = wording;
    return this;
  }

   /**
   * Get wording
   * @return wording
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getWording() {
    return wording;
  }

  public void setWording(String wording) {
    this.wording = wording;
  }

  public Trait dice(List<DiePool> dice) {
    this.dice = dice;
    return this;
  }

  public Trait addDiceItem(DiePool diceItem) {
    this.dice.add(diceItem);
    return this;
  }

   /**
   * Get dice
   * @return dice
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public List<DiePool> getDice() {
    return dice;
  }

  public void setDice(List<DiePool> dice) {
    this.dice = dice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trait trait = (Trait) o;
    return Objects.equals(this.wording, trait.wording) &&
        Objects.equals(this.dice, trait.dice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wording, dice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trait {\n");
    
    sb.append("    wording: ").append(toIndentedString(wording)).append("\n");
    sb.append("    dice: ").append(toIndentedString(dice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

