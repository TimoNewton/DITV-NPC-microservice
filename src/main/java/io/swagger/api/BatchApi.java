package io.swagger.api;

import io.swagger.model.Batch;
import java.math.BigDecimal;

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

@Api(value = "batch", description = "the batch API")
public interface BatchApi {

    @ApiOperation(value = "", notes = "Retrieve a batch of NPC's", response = Batch.class, tags={ "NPC Batches", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Requested batch of NPC's", response = Batch.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Batch.class) })
    @RequestMapping(value = "/batch/{batch}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Batch> getBatch(@ApiParam(value = "unique identifier of the batch",required=true ) @PathVariable("batch") BigDecimal batch);


    @ApiOperation(value = "", notes = "update a batch of NPC's", response = Batch.class, tags={ "NPC Batches", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The NPC Batch", response = Batch.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Batch.class) })
    @RequestMapping(value = "/batch/{batch}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Batch> updateBatch(@ApiParam(value = "unique identifier of the batch",required=true ) @PathVariable("batch") BigDecimal batch,
        @ApiParam(value = "The NPC batch payload" ,required=true ) @RequestBody Batch batchPayload);

}
