package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Batch;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NPCBatchesApi
 */
public class NPCBatchesApiTest {

    private NPCBatchesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(NPCBatchesApi.class);
    }

    
    /**
     * 
     *
     * Creates a new batch of NPC&#39;s
     */
    @Test
    public void createBatchTest() {
        BigDecimal game = null;
        // api.createBatch(game);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve a batch of NPC&#39;s
     */
    @Test
    public void getBatchTest() {
        BigDecimal batch = null;
        // api.getBatch(batch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve collections of NPC&#39;s and Proto-NPC&#39;s associated with a specific game
     */
    @Test
    public void getBatchesTest() {
        BigDecimal game = null;
        String state = null;
        // List<Batch> response = api.getBatches(game, state);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * update a batch of NPC&#39;s
     */
    @Test
    public void updateBatchTest() {
        BigDecimal batch = null;
        // Batch response = api.updateBatch(batch);

        // TODO: test validations
    }
    
}
