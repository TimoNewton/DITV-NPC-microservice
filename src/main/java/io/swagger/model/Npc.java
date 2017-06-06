package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Stat;
import io.swagger.model.Trait;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Npc
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-05T22:34:58.793-05:00")

public class Npc   {
  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PROTO("proto"),
    
    ALIVE("alive"),
    
    DEAD("dead");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("stats")
  private List<Stat> stats = new ArrayList<Stat>();

  @JsonProperty("traits")
  private List<Trait> traits = new ArrayList<Trait>();

  @JsonProperty("relationships")
  private List<Trait> relationships = new ArrayList<Trait>();

  public Npc name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Npc status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Npc stats(List<Stat> stats) {
    this.stats = stats;
    return this;
  }

  public Npc addStatsItem(Stat statsItem) {
    this.stats.add(statsItem);
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(value = "")
  public List<Stat> getStats() {
    return stats;
  }

  public void setStats(List<Stat> stats) {
    this.stats = stats;
  }

  public Npc traits(List<Trait> traits) {
    this.traits = traits;
    return this;
  }

  public Npc addTraitsItem(Trait traitsItem) {
    this.traits.add(traitsItem);
    return this;
  }

   /**
   * Get traits
   * @return traits
  **/
  @ApiModelProperty(value = "")
  public List<Trait> getTraits() {
    return traits;
  }

  public void setTraits(List<Trait> traits) {
    this.traits = traits;
  }

  public Npc relationships(List<Trait> relationships) {
    this.relationships = relationships;
    return this;
  }

  public Npc addRelationshipsItem(Trait relationshipsItem) {
    this.relationships.add(relationshipsItem);
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(value = "")
  public List<Trait> getRelationships() {
    return relationships;
  }

  public void setRelationships(List<Trait> relationships) {
    this.relationships = relationships;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Npc npc = (Npc) o;
    return Objects.equals(this.name, npc.name) &&
        Objects.equals(this.status, npc.status) &&
        Objects.equals(this.stats, npc.stats) &&
        Objects.equals(this.traits, npc.traits) &&
        Objects.equals(this.relationships, npc.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, stats, traits, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Npc {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

