package org.CMVD.Softwork.Fileshield.Servicios;

import org.CMVD.Softwork.Fileshield.Model.Correo;
import org.CMVD.Softwork.Fileshield.Model.EnlaceSeguro;
import org.CMVD.Softwork.Fileshield.Model.Usuario;
import java.util.Optional;

public interface EnlaceSeguroService {
    EnlaceSeguro generarEnlaceSeguro(Correo correo, Usuario receptor, String claveBase64);
    Optional<EnlaceSeguro> validarToken(String token, String correoUsuario);
}
