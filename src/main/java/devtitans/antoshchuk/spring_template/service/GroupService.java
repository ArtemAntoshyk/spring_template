package devtitans.antoshchuk.spring_template.service;

import devtitans.antoshchuk.spring_template.model.Group;
import devtitans.antoshchuk.spring_template.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    private GroupRepository groupRepository;

    @Autowired
    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public void addGroup(Group group) {
        groupRepository.save(group);
    }

    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    public void deleteGroup(long id) {
        groupRepository.deleteById(id);
    }



}
