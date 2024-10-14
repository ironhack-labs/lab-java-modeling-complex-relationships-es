package org.amazon.ejerciciocheckforundersjpaquerys;

import org.amazon.ejerciciocheckforundersjpaquerys.Model.Section;
import org.amazon.ejerciciocheckforundersjpaquerys.Repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerCheck {

    @Autowired
    private SectionRepository sectionRepository;
}
