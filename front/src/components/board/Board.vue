<script setup>
import ThumbnailPost from '@/components/post/ThumbnailPost';
import Tab from '@/components/board/Tab';
import {ref} from 'vue';

const props = defineProps({
  /**
   * tab in tabs
   * @property {string} name                  -required
   * @property {Array<post>} posts            -required
   * @property {Function<post>} onPostClicked -required
   */
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
      <!-- todo ThumbnailPost 10개 이상인 경우 처리 -->
      <ThumbnailPost
        v-for="(post, index) in tabs[selectedTabIndex].posts"
        :key="index"
        :post="post"
        :onPostClicked="tabs[selectedTabIndex].onPostClicked"
      ></ThumbnailPost>
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
    flex-wrap: wrap;
    flex: 1 0;
    gap: 10px;
  }
}
</style>