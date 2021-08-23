package br.com.alelo.consumerpat.core.mapper.domain;

import br.com.alelo.consumerpat.core.domain.ContactDomain;
import br.com.alelo.consumerpat.core.dto.v1.request.ContactV1RequestDto;
import br.com.alelo.consumerpat.dataprovider.jpa.entity.ContactEntity;

public class ContactDomainMapper {

    public static ContactDomain convert(ContactV1RequestDto request) {
        if (request == null) {
            return null;
        }

        return ContactDomain.builder()
                .email(request.getEmail())
                .mobilePhone(request.getMobilePhone())
                .residencePhone(request.getResidencePhone())
                .build();
    }

    public static ContactDomain convert(ContactV1RequestDto request, ContactDomain contactDomain) {
        if (request == null || contactDomain == null) {
            return null;
        }

        return ContactDomain.builder()
                .id(contactDomain.getId())
                .email(request.getEmail())
                .mobilePhone(request.getMobilePhone())
                .residencePhone(request.getResidencePhone())
                .build();
    }

    public static ContactDomain convert(ContactEntity entity) {
        if (entity == null) {
            return null;
        }

        return ContactDomain.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .mobilePhone(entity.getMobilePhone())
                .residencePhone(entity.getResidencePhone())
                .consumer(ConsumerDomainMapper.convertOnlyConsumer(entity.getConsumer()))
                .build();
    }
}
