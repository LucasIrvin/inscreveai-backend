package com.example.inscreveai.anotations;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema())),
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema())),
        @ApiResponse(responseCode = "204", description = "No Content", content = @Content(schema = @Schema())),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema())),
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema())),
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema())),
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema())),
        @ApiResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema())),
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema())),
        @ApiResponse(responseCode = "502", description = "Bad Gateway", content = @Content(schema = @Schema())),
        @ApiResponse(responseCode = "503", description = "Service Unavailable", content = @Content(schema = @Schema()))
})

public @interface CommonApiResponses {
}
