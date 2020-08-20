public enum DayOfWeek { Monday(8), Tuesday(8), Wednesday(8), Thursday(8),
    Friday(8), Saturday(0), Sunday(0);
private int workHours = 8;

    DayOfWeek(int workHours) {
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

}
