package br.com.alelo.consumer.consumerpat.core.usecase;

import br.com.alelo.consumer.consumerpat.core.dto.v1.request.ConsumerPaginatedV1RequestDto;
import br.com.alelo.consumer.consumerpat.core.dto.v1.response.ConsumerV1ResponseDto;
import br.com.alelo.consumer.consumerpat.core.dto.v1.response.PaginatedResponseDto;

public interface ConsumerFindUseCase {

    PaginatedResponseDto<ConsumerV1ResponseDto> findAll(ConsumerPaginatedV1RequestDto request);
}
