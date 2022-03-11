package com.simbirsoft.taskboard.service.mapper;

import com.simbirsoft.taskboard.dto.ReleasesDto;
import com.simbirsoft.taskboard.entity.Releases;
import org.springframework.stereotype.Component;

@Component
public class ReleasesMapper {
    public ReleasesDto ReleasesToDto(Releases releases) {
        ReleasesDto releasesDto = new  ReleasesDto();
        releasesDto.setReleasesId(releases.getReleasesId());
        releasesDto.setTimeBegin(releases.getTimeBegin());
        releasesDto.setVersion(releases.getVersion());
        releasesDto.setTimeFinal(releases.getTimeFinal());
        return releasesDto;
    }
    public Releases ReleasesToEntity (ReleasesDto releasesDto) {
        Releases releases = new  Releases();
        releases.setReleasesId(releasesDto.getReleasesId());
        releases.setTimeBegin(releasesDto.getTimeBegin());
        releases.setVersion(releasesDto.getVersion());
        releases.setTimeFinal(releasesDto.getTimeFinal());
        return releases;
    }

}
