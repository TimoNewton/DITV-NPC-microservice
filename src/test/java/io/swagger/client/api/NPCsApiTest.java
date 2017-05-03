package io.swagger.client.api;

import io.swagger.client.ApiClient;
import java.math.BigDecimal;
import io.swagger.client.model.Npc;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NPCsApi
 */
public class NPCsApiTest {

    private NPCsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(NPCsApi.class);
    }

    
    /**
     * 
     *
     * retrieves a NPC for this game
     */
    @Test
    public void getNPCTest() {
        BigDecimal npc = null;
        // Npc response = api.getNPC(npc);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * retrieves all defined NPC&#39;s for this game
     */
    @Test
    public void getNPCsTest() {
        BigDecimal game = null;
        // List<Npc> response = api.getNPCs(game);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * updates a NPC for this game
     */
    @Test
    public void updateNPCTest() {
        BigDecimal npc = null;
        // Npc response = api.updateNPC(npc);

        // TODO: test validations
    }
    
}
