package io.swagger.api;

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
public class NpcApiController implements NpcApi {



    public ResponseEntity<Npc> getNPC(@ApiParam(value = "Unique identifier of the npc",required=true ) @PathVariable("npc") BigDecimal npc) {
        // do some magic!
        return new ResponseEntity<Npc>(HttpStatus.OK);
    }

    public ResponseEntity<Npc> updateNPC(@ApiParam(value = "Unique identifier of the npc",required=true ) @PathVariable("npc") BigDecimal npc) {
        // do some magic!
        return new ResponseEntity<Npc>(HttpStatus.OK);
    }

}
