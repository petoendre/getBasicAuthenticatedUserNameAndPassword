package afsdgsgdhf;

import java.nio.charset.Charset;
import java.util.Base64;
import javax.annotation.Resources;
import javax.xml.ws.Response;

public class TestInterfaceImpl implements TestInterface {

  @Context
  private HttpServletRequest request;

  @Override
  @PermissionAllowed(Resources.ALLOW_CSP_REST)
  public Response cspSingleInitSignature(Long certificateId,
    String fileHashType,
    String fileHash) {

    String[] datas = getBasicAuthenticatedUserNameAndPassword();
    String username = datas[0];
    String password = datas[1];

    return response;
  }

  private String[] getBasicAuthenticatedUserNameAndPassword() {
    final String authorization = request.getHeader("Authorization");
    // Authorization: Basic base64credentials
    String base64Credentials = authorization.substring("Basic".length()).trim();
    String credentials = new String(Base64.getDecoder().decode(base64Credentials),
      Charset.forName("UTF-8"));
    // credentials = username:password
    final String[] values = credentials.split(":", 2);
    return values;
  }

}
