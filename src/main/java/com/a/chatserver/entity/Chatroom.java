package com.a.chatserver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Chatroom {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chatroom_id")
    private Long id;

    private String title;

    @OneToMany(mappedBy = "chatroom")
    private Set<MemberChatroomMapping> memberChatroomMappingSet;

    private LocalDateTime createdAt;

    // 새로운 메시지를 가지고 있는지, 안 가지고 있는지 확인
    // 언제 조회하는지에 따라서 값이 수시로 달라짐
    // @Transient : db에 저장 안됨
    @Transient Boolean hasNewMessage;

    public void setHasNewMessage(Boolean hasNewMessage){
        this.hasNewMessage = hasNewMessage;
    }

    // 채팅방에 Member 추가
    public MemberChatroomMapping addMember(Member member){
        if(this.getMemberChatroomMappingSet() == null) {
            this.memberChatroomMappingSet = new HashSet<>();
        }

        MemberChatroomMapping memberChatroomMapping = MemberChatroomMapping.builder()
                .member(member)
                .chatroom(this)
                .build();

        this.memberChatroomMappingSet.add(memberChatroomMapping);

        return memberChatroomMapping;

    }

}
