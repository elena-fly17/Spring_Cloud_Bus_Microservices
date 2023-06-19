package com.example.client_1.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@Data
// Для обновления бинов во время работы приложения - когда бин помечен @RefreshScope,
// он может быть динамически обновлен без перезапуска приложения - при изменении конфигов
// бин будет пересоздан с обновленными значениями свойств
@RefreshScope
@ConfigurationProperties(prefix = "bus")
public class InfoModel {

    private String dataField;
}
