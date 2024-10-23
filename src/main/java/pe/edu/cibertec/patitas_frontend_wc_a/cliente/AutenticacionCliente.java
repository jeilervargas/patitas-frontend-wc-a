package pe.edu.cibertec.patitas_frontend_wc_a.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "autenticacion", url = "http://localhost:8081/autenticacion", configuration = AutenticacionFeingConfig.class)
public interface AutenticacionCliente {

    @PostMapping("/signout")
    ResponseEntity<SignOutResponseDTO> logout(@RequestBody SignOutRequestDTO logoutRequestDTO);

}
