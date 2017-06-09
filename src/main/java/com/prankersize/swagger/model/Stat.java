package com.prankersize.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prankersize.swagger.model.DiePool;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Stat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-09T14:57:59.332-05:00")

public class Stat   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("dice")
  private DiePool dice = null;

  public Stat name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Stat dice(DiePool dice) {
    this.dice = dice;
    return this;
  }

   /**
   * Get dice
   * @return dice
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public DiePool getDice() {
    return dice;
  }

  public void setDice(DiePool dice) {
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
    Stat stat = (Stat) o;
    return Objects.equals(this.name, stat.name) &&
        Objects.equals(this.dice, stat.dice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stat {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

