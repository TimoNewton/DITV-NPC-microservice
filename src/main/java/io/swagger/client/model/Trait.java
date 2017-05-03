/*
 * Dogs in the Vineyard Non-Player Character API
 * API used to manage Non-Player Characters (NPCs) in a game of Dogs in the Vineyard (DitV)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: motipha@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DiePool;
import java.util.ArrayList;
import java.util.List;

/**
 * Trait
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T17:03:54.560-05:00")
public class Trait {
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
  @ApiModelProperty(example = "null", required = true, value = "")
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
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<DiePool> getDice() {
    return dice;
  }

  public void setDice(List<DiePool> dice) {
    this.dice = dice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
