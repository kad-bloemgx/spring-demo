package nl.kadaster.dhub.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ScopeRestController {

    @GetMapping(value = "/scope")
   /* public String currentUserName(Principal principal) {
        return principal.getName();
     */
    public String currentScopes(Authentication authentication) {

        System.out.println(authentication.getName());
        System.out.println(authentication.getDetails().toString());
        return authentication.getAuthorities().toString();

    }
}
