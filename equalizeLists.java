private List<Model> equalizeLists(List<Model> list1, List<Model> list2) { // 1 > 2
        List<Model> newList2 = new ArrayList<>();
        boolean hasDate;
        for (Model model1 : list1) {
            hasDate = false;
            for (Model model2 : list2) {
                if (model1.date == model2.date) {
                    hasDate = true;
                    newList2.add(model2);
                    break;
                }
            }
            if (!hasDate) {
                newList2.add(new Model(0, model1.date));
            }
        }
        return newList2;
    }
