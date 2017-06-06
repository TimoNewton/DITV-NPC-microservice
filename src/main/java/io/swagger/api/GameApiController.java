package io.swagger.api;

import io.swagger.model.Batch;
import java.math.BigDecimal;
import io.swagger.model.Npc;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-05T22:34:58.793-05:00")

@Controller
public class GameApiController implements GameApi {



    public ResponseEntity<Batch> createBatch(@ApiParam(value = "unique identifier of the game",required=true ) @PathVariable("game") BigDecimal game) {
        // do some magic!
        return new ResponseEntity<Batch>(HttpStatus.OK);
    }

    public ResponseEntity<List<Batch>> getBatches(@ApiParam(value = "unique identifier of the game",required=true ) @PathVariable("game") BigDecimal game,
         @ApiParam(value = "State of the batch: Active, Unpopulated, Exhausted") @RequestParam(value = "state", required = false) String state) {
        // do some magic!
        return new ResponseEntity<List<Batch>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Npc>> getNPCs(@ApiParam(value = "Unique identifier of the game",required=true ) @PathVariable("game") BigDecimal game) {
        // do some magic!
        return new ResponseEntity<List<Npc>>(HttpStatus.OK);
    }

}
