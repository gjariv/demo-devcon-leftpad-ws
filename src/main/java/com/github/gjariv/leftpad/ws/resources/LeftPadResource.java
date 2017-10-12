package com.github.gjariv.leftpad.ws.resources;

import com.github.gjariv.leftpad.LeftPad;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import org.json.simple.JsonObject;

@Singleton
@Path("/leftpad")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LeftPadResource {

	@GET
	public JsonObject getTest() {
        JsonObject jsonResp = new JsonObject();
        jsonResp.put("padded", " pa");
        return jsonResp;
	}
	
    @POST
    public JsonObject leftPad(JsonObject json) {
        String padded = LeftPad.leftPad(json.getString("str"), json.getInteger("len"), json.getStringOrDefault("ch", " "));
        JsonObject jsonResp = new JsonObject();
        jsonResp.put("padded", padded);
        return jsonResp;
    }
}
