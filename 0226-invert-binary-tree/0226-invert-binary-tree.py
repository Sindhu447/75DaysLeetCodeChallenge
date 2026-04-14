class Solution:
    def invertTree(self, root):
        if root is None:
            return None
        
        # swap children
        root.left, root.right = root.right, root.left
        
        # recursive calls
        self.invertTree(root.left)
        self.invertTree(root.right)
        
        return root