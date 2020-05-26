package Starting;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;

import java.util.Collection;
import java.util.Objects;

import static Starting.Helper.getAllProjectClasses;

public class StartingTests extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        Collection<VirtualFile> classes = getAllProjectClasses(Objects.requireNonNull(e.getProject()));

        Messages.showMessageDialog(e.getProject(), "Test creation completed", "Creator Tests",
                Messages.getInformationIcon());
    }
}
