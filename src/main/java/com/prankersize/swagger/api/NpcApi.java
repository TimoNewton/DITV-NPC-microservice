package com.prankersize.swagger.api;

import java.math.BigDecimal;
import com.prankersize.swagger.model.Npc;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-09T14:57:59.332-05:00")

@Api(value = "npc", description = "the npc API")
public interface NpcApi {

    @ApiOperation(value = "", notes = "retrieves a NPC for this game", response = Npc.class, tags={ "NPCs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "NPC", response = Npc.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Npc.class) })
    @RequestMapping(value = "/npc/{npc}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Npc> getNPC(@ApiParam(value = "Unique identifier of the npc", required = true) @PathVariable("npc") BigDecimal npc);


    @ApiOperation(value = "", notes = "updates a NPC for this game", response = Npc.class, tags={ "NPCs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "NPC", response = Npc.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Npc.class) })
    @RequestMapping(value = "/npc/{npc}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Npc> updateNPC(@ApiParam(value = "Unique identifier of the npc", required = true) @PathVariable("npc") BigDecimal npc);

}
