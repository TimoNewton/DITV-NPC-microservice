package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.Batch;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T17:03:54.560-05:00")
public interface NPCBatchesApi extends ApiClient.Api {


  /**
   * 
   * Creates a new batch of NPC&#39;s
    * @param game unique identifier of the game (required)
   */
  @RequestLine("POST /{game}/batch")
  @Headers({
    "Content-Type: application/json",
    "Accept: json",
  })
  void createBatch(@Param("game") BigDecimal game);

  /**
   * 
   * Retrieve a batch of NPC&#39;s
    * @param batch unique identifier of the batch (required)
   */
  @RequestLine("GET /batch/{batch}")
  @Headers({
    "Content-Type: application/json",
    "Accept: json",
  })
  void getBatch(@Param("batch") BigDecimal batch);

  /**
   * 
   * Retrieve collections of NPC&#39;s and Proto-NPC&#39;s associated with a specific game
    * @param game unique identifier of the game (required)
    * @param state State of the batch: Active, Unpopulated, Exhausted (optional)
   * @return List&lt;Batch&gt;
   */
  @RequestLine("GET /{game}/batches?state={state}")
  @Headers({
    "Content-Type: application/json",
    "Accept: json",
  })
  List<Batch> getBatches(@Param("game") BigDecimal game, @Param("state") String state);

  /**
   * 
   * update a batch of NPC&#39;s
    * @param batch unique identifier of the batch (required)
   * @return Batch
   */
  @RequestLine("PUT /batch/{batch}")
  @Headers({
    "Content-Type: application/json",
    "Accept: json",
  })
  Batch updateBatch(@Param("batch") BigDecimal batch);
}
