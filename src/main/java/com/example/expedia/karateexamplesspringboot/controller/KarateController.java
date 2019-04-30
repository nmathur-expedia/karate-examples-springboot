package com.example.expedia.karateexamplesspringboot.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KarateController {

    @RequestMapping(value = "/user-json",
            produces = "application/json",
            method = RequestMethod.GET)
    public String jsonEndpoint() {

        return "{\n" +
                "  \"avengers\": {\n" +
                "    \"brand\": \"Marvel\",\n" +
                "    \"characters\": [\n" +
                "      {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"Tony Stark\",\n" +
                "        \"character\": \"IronMan\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 2,\n" +
                "        \"name\": \"Steve Rogers\",\n" +
                "        \"character\": \"Captain America\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 3,\n" +
                "        \"name\": \"Bruce Banner\",\n" +
                "        \"character\": \"hulk\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"justice-league\": {\n" +
                "    \"brand\": \"DC\",\n" +
                "    \"characters\": [\n" +
                "      {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"Bruce Wayne\",\n" +
                "        \"character\": \"BatMan\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 2,\n" +
                "        \"name\": \"Clark Kent\",\n" +
                "        \"character\": \"SuperMan\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 3,\n" +
                "        \"name\": \"Diana Prince\",\n" +
                "        \"character\": \"Wonder Woman\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";
    }

    @RequestMapping(value = "/user-xml",
            produces = "application/xml",
            method = RequestMethod.GET)
    public String xmlEndpoint() {
        return  "<superheros>\n" +
                "   <avengers>\n" +
                "      <brand>Marvel</brand>\n" +
                "      <characters>\n" +
                "         <element>\n" +
                "            <character>IronMan</character>\n" +
                "            <id>1</id>\n" +
                "            <name>Tony Stark</name>\n" +
                "         </element>\n" +
                "         <element>\n" +
                "            <character>Captain America</character>\n" +
                "            <id>2</id>\n" +
                "            <name>Steve Rogers</name>\n" +
                "         </element>\n" +
                "         <element>\n" +
                "            <character>hulk</character>\n" +
                "            <id>3</id>\n" +
                "            <name>Bruce Banner</name>\n" +
                "         </element>\n" +
                "      </characters>\n" +
                "   </avengers>\n" +
                "   <justice-league>\n" +
                "      <brand>DC</brand>\n" +
                "      <characters>\n" +
                "         <element>\n" +
                "            <character>BatMan</character>\n" +
                "            <id>1</id>\n" +
                "            <name>Bruce Wayne</name>\n" +
                "         </element>\n" +
                "         <element>\n" +
                "            <character>SuperMan</character>\n" +
                "            <id>2</id>\n" +
                "            <name>Clark Kent</name>\n" +
                "         </element>\n" +
                "         <element>\n" +
                "            <character>Wonder Woman</character>\n" +
                "            <id>3</id>\n" +
                "            <name>Diana Prince</name>\n" +
                "         </element>\n" +
                "      </characters>\n" +
                "   </justice-league>\n" +
                "</superheros>";
    }

    @RequestMapping(value = "/user-post-json",
            produces = "application/json",
            consumes = "application/json",
            method = RequestMethod.POST)
    public String postEndpoint(@RequestBody String request) {
        return request;
    }
}
