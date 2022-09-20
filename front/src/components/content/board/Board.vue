<script setup>
import Post from '@/components/content/board/Post';
import Tab from '@/components/content/board/Tab';
import {ref} from 'vue';

const props = defineProps({
  // tabs = { name: String, }
  tabs: {
    required: true,
    type: Array,
  }
})

// 선택된 Tab Index
const selectedTabIndex = ref(0)
const clickTab = (index) => {
  selectedTabIndex.value = index
}
</script>

<template>
  <div class="board">
    <div class="tab-section">
      <Tab
        v-for="(tab, index) in tabs"
        :key="index"
        :index="index"
        :selected="index === selectedTabIndex"
        @clickTab="clickTab"
      >
        {{ tab.name }}
      </Tab>
    </div>
    <div class="post-section">
      <Post
        v-for="(post, index) in tabs[selectedTabIndex].posts"
        :key="index"
        :post="post"
      ></Post>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.board {
  display: flex;
  height: 300px;
  flex-direction: column;

  .tab-section {
    display: flex;
    align-content: center;
    flex: 0 0 20px;
    border-bottom: 1px solid $HIGH-GREY;
  }

  .post-section {
    display: flex;
    padding-top: 10px;
    flex: 1 0;
    gap: 10px;
  }
}
</style>