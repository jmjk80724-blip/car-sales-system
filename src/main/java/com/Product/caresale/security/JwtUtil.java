package com.Product.caresale.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;


@Component
public class JwtUtil {
    private  final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256); //Creat token follow by Hs256
    private  final long EXPIRATION_TIME = 1000 * 60 * 60; // Generate token for 1 hourse

    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username) // Show username
                .setIssuedAt(new Date()) // Show Date currently
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key) //Create Token  for user
                .compact(); // Create token user
    }
    public String extractUsername(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
