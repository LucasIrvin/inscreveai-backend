package com.example.inscreveai.models.enums;

public enum MovementStatusEnum {

    // Boleto ou pix
    PROCESSING,
    PENDING,
    PAID,
    CANCELED, // Vai para o cartão e o parcelamento também

    // Cartão
    REFUSED,
    AUTHORIZED,
    ERROR,
    REVERSAL,
    REFUNDED,

    // PARCELAMENTO VIA BOLETO OU PIX
    ACTIVE



}
