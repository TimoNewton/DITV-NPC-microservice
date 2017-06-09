package com.prankersize.swagger.api;

import com.prankersize.swagger.model.Batch;
import java.math.BigDecimal;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-09T14:57:59.332-05:00")

@Controller
public class BatchApiController implements BatchApi {



    public ResponseEntity<Batch> getBatch(@ApiParam(value = "unique identifier of the batch",required=true ) @PathVariable("batch") BigDecimal batch) {
        // do some magic!
        return new ResponseEntity<Batch>(HttpStatus.OK);
    }

    public ResponseEntity<Batch> updateBatch(@ApiParam(value = "unique identifier of the batch",required=true ) @PathVariable("batch") BigDecimal batch,
        @ApiParam(value = "The NPC batch payload" ,required=true ) @RequestBody Batch batchPayload) {
        // do some magic!
        return new ResponseEntity<Batch>(HttpStatus.OK);
    }

}
