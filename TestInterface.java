package afsdgsgdhf;

import java.awt.PageAttributes.MediaType;
import javax.xml.ws.Response;

public interface TestInterface {

  @GET
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces({ MediaType.APPLICATION_JSON })
  @Path("anyPath")
  @ApiOperation(value = "", notes = "")
  @ApiResponses({
    @ApiResponse(code = 200, message = "OK"),
    @ApiResponse(code = 403, message = "Insufficient rights"),
    @ApiResponse(code = 400, message = "Invalid syntax") })
  public Response cspSingleInitSignature(
    @ApiParam(value = "data", required = true) @QueryParam("data") Long data,
    @ApiParam(value = "data1", required = true) @QueryParam("data1") String data1,
    @ApiParam(value = "data2", required = true) @QueryParam("data2") String data2);

}
