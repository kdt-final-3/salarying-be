package com.finalproject.recruit.parameter;

import com.finalproject.recruit.exception.notice.ErrorCode;
import com.finalproject.recruit.exception.notice.NoticeException;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NoticeStep {
    DOCS_PASS("서류 전형에 합격하신 것을 진심으로 축하드립니다."),
    DOCS_FAIL("안타깝게도 서류 전형에 불합격 하셨습니다. 비록 이번 전형을 통해 함께 하지는 못하지만, 진심 어린 응원의 마음을 전해드립니다."),
    //면접합격("축하드립니다. 면접 전형에 합격하셨습니다."),
    MEET_PROPOSAL("면접 일정 알려드립니다."),
    //면접불합격("안타깝게도 면접 전형에 불합격 하셨습니다. 비록 이번 전형을 통해 함께 하지는 못하지만, 진심 어린 응원의 마음을 전해드립니다."),
    FINAL_PASS("최종 합격하신 것을 진심으로 축하드립니다."),
    FINAL_FAIL("안타깝게도 최종 불합격 하셨습니다. 비록 이번 전형을 통해 함께 하지는 못하지만, 진심 어린 응원의 마음을 전해드립니다.");
    private final String message;
}
