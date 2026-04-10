

int hasCycle(struct ListNode *head) {
    if (head == NULL || head->next == NULL) {
        return 0; // false
    }

    struct ListNode *slow = head;
    struct ListNode *fast = head;

    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;           // move 1 step
        fast = fast->next->next;     // move 2 steps

        if (slow == fast) {
            return 1; // true (cycle found)
        }
    }

    return 0; // false (no cycle)
}
