package io.swagger.client.api;

import io.swagger.client.ApiClient;

import java.math.BigDecimal;
import io.swagger.client.model.Npc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T17:03:54.560-05:00")
public interface NPCsApi extends ApiClient.Api {


  /**
   * 
   * retrieves a NPC for this game
    * @param npc Unique identifier of the npc (required)
   * @return Npc
   */
  @RequestLine("GET /npc/{npc}")
  @Headers({
    "Content-Type: application/json",
    "Accept: json",
  })
  Npc getNPC(@Param("npc") BigDecimal npc);

  /**
   * 
   * retrieves all defined NPC&#39;s for this game
    * @param game Unique identifier of the game (required)
   * @return List&lt;Npc&gt;
   */
  @RequestLine("GET /{game}/npcs")
  @Headers({
    "Content-Type: application/json",
    "Accept: json",
  })
  List<Npc> getNPCs(@Param("game") BigDecimal game);

  /**
   * 
   * updates a NPC for this game
    * @param npc Unique identifier of the npc (required)
   * @return Npc
   */
  @RequestLine("PUT /npc/{npc}")
  @Headers({
    "Content-Type: application/json",
    "Accept: json",
  })
  Npc updateNPC(@Param("npc") BigDecimal npc);
}
