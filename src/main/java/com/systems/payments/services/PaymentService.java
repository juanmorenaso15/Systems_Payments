package com.systems.payments.services;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.systems.payments.entity.Payment;
import com.systems.payments.entity.enums.TypePayment;
import com.systems.payments.repository.PaymentRepository;
import com.systems.payments.repository.StudentRespository;

@Service
@Transactional
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private StudentRespository studentRespository;

    /*
     * Creamos Una ruta donde se guardará el archivo
     * System.getProperty("user.home"): Obtiene la ruta del directorio personal del
     * usuario del 5.0
     * Paths.get(...): Crea un objeto Path apuntando a una carpeta llamada
     * enset/pagos dentro del director
     */
    public Payment savePayment(MultipartFile file, double amount, TypePayment typePayment, LocalDate date,
            String codeStudent) {
        Path folderPath = Paths.get(System.getProperty("user.home"), "enset-data", "Payments");

        if (!Files.exists(folderPath)) {
            try {
                Files.createDirectories(folderPath);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error al crear la carpeta:"+ e.getMessage());
            }
        }

        String fileName = UUID.randomUUID().toString();

        Path FilePath = Paths.get(System.getProperty("user.home"),"enset-data", "Payments", fileName+".pdf");

        return null;

    }

}
