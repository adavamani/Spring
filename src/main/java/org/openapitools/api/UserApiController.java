package org.openapitools.api;

import org.openapitools.model.UserDao;
import org.openapitools.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-12T11:33:32.539-05:00[America/Chicago]")

@Controller
@RequestMapping("${openapi.user.base-path:}")
public class UserApiController implements UserApi {

    private final NativeWebRequest request;
    
    @Autowired
    private UserDao userDao;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    

    /**
     * GET /user/getAllUser : getAllUser
     * Operation to get all users
     *
     * @param body  (optional)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "getAllUser", nickname = "getUserGetAllUser", notes = "Operation to get all users", response = UserModel.class, responseContainer = "List", tags={ "operations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserModel.class, responseContainer = "List") })
    @RequestMapping(value = "/user/getAllUser",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    public ResponseEntity<List<UserModel>> getUserGetAllUser(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Object body) {
       
    	List<UserModel> userList = (List<UserModel>) userDao.findAll();
    	return ResponseEntity.ok().body(userList);

    }


    /**
     * POST /user/createUser : createUser
     * create a user
     *
     * @param userModel  (optional)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "createUser", nickname = "postUserCreateUser", notes = "create a user", response = UserModel.class, tags={ "operations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserModel.class) })
    @RequestMapping(value = "/user/createUser",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    public ResponseEntity<UserModel> postUserCreateUser(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) UserModel userModel) {
		/*
		 * getRequest().ifPresent(request -> { for (MediaType mediaType:
		 * MediaType.parseMediaTypes(request.getHeader("Accept"))) { if
		 * (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) { String
		 * exampleString =
		 * "{ \"firstName\" : \"Amal\", \"lastName\" : \"raj\", \"role\" : \"role\", \"id\" : \"id\" }"
		 * ; ApiUtil.setExampleResponse(request, "application/json", exampleString);
		 * break; } } });
		 */
       // return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    	userDao.save(userModel);
    	return ResponseEntity.ok().body(userModel);
        

    }



}
