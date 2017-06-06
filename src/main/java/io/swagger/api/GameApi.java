package io.swagger.api;

import io.swagger.model.Batch;
import java.math.BigDecimal;
import io.swagger.model.Npc;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-05T22:34:58.793-05:00")

@Api(value = "{game}", description = "the {game} API")
public interface GameApi {

    @ApiOperation(value = "", notes = "Creates a new batch of NPC's", response = Batch.class, tags={ "NPC Batches", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "NPC Batch has been successfully created", response = Batch.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Batch.class) })
    @RequestMapping(value = "/{game}/batch",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Batch> createBatch(@ApiParam(value = "unique identifier of the game",required=true ) @PathVariable("game") BigDecimal game);


    @ApiOperation(value = "", notes = "Retrieve collections of NPC's and Proto-NPC's associated with a specific game", response = Batch.class, responseContainer = "List", tags={ "NPC Batches", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "list of all batches of NPC's created in this game", response = Batch.class),
        @ApiResponse(code = 404, message = "Unable to find the specified game", response = Batch.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Batch.class) })
    @RequestMapping(value = "/{game}/batches",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Batch>> getBatches(@ApiParam(value = "unique identifier of the game",required=true ) @PathVariable("game") BigDecimal game,
         @ApiParam(value = "State of the batch: Active, Unpopulated, Exhausted") @RequestParam(value = "state", required = false) String state);


    @ApiOperation(value = "", notes = "retrieves all defined NPC's for this game", response = Npc.class, responseContainer = "List", tags={ "NPCs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "all NPC's in the specified game", response = Npc.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Npc.class) })
    @RequestMapping(value = "/{game}/npcs",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Npc>> getNPCs(@ApiParam(value = "Unique identifier of the game",required=true ) @PathVariable("game") BigDecimal game);

}
